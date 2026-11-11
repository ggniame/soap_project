<?php
$wsdl = "http://localhost:8080/PhoneValidatorService-1.0-SNAPSHOT/PhoneValidatorService/PhoneValidator?wsdl";

try {
    $client = new SoapClient($wsdl, [
        'trace' => true, 
        'exceptions' => true
    ]);

    
    $response = $client->validatePhone([
        'pNum' => '0633378'
    ]);

    
    echo "<h2>Réponse du serveur Java (WildFly) :</h2>";
    echo "<pre>";
    print_r($response);
    echo "</pre>";

} catch (SoapFault $e) {
    echo "<h3>Erreur SOAP :</h3>";
    echo "<p>" . $e->getMessage() . "</p>";
}
?>