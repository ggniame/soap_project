# Cross-Platform SOAP Web Service & Multi-Language Clients

A contract-first SOAP web service for phone number validation, built with Java (JAX-WS) on WildFly and consumed from Java, Python, Node.js, and PHP.

## Architecture & Tech Stack
* **Backend / Service Provider:** Java (JAX-WS) deployed on WildFly, exposing an explicit WSDL contract.
* **API Testing & Validation:** SoapUI (used for mocking, request payload inspection, and endpoint verification).
* **Clients:**
  * **Java Client:** Native JAX-WS client implementation.
  * **Python Client:** Integrated using `zeep`.
  * **Node.js Client:** Integrated using `node-soap`.
  * **PHP Client:** Integrated using native `SoapClient`.

## Repository Structure
```text
soap_project/
├── server/                 # Java JAX-WS server implementation & WSDL definition
├── clients/
│   ├── PhoneValidatorJavaClient/        # Native Java client implementation
│   ├── PhoneValidatorPythonClient/      # Python client implementation (zeep)
│   ├── PhoneValidatorNodeClient/        # Node.js client implementation (node-soap)
│   └── PhoneValidatorPHPClient/         # PHP client implementation (SoapClient)
└── README.md
```
## Running the Server

1. Build: `mvn clean package`
2. Deploy the WAR to WildFly
3. WSDL available at: `http://localhost:8080/PhoneValidatorService-1.0-SNAPSHOT/PhoneValidatorService/PhoneValidator?wsdl'
`

## Running the Clients
### Python
`pip install zeep` then `python client.py`
### Node.js
`npm install` then `node client.js`
### PHP
`php client.php`
### Java
