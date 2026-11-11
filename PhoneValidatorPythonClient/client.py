from zeep import Client

wsdl_url = 'http://localhost:8080/PhoneValidatorService-1.0-SNAPSHOT/PhoneValidatorService/PhoneValidator?wsdl'

try:
    print("Connecting to SOAP service via Python...")
 
    client = Client(wsdl=wsdl_url)

    result = client.service.validatePhone(pNum='0633378')

    print("Response from server:", result)

except Exception as e:
    print("An error occurred:", e)