# convert-test

## Overview

This project exposes a simple API that, when accessed via a GET request,
fetches data from an external SOAP web service:
http://www.crcind.com/csp/samples/SOAP.Demo.cls?soap_method=FindPerson&id={id}

It then transforms the SOAP XML response into JSON and returns the result.

## Technologies

- Java 17
- Spring Boot
- Spring Integration

## Usage

When you call the API, it returns a response based on the outcome of the operation.
Each response includes a status code for clarity:

- **Code 0:** Everything worked perfectly.
- **Code 1:** The provided URL is not valid.
- **Code 2:** The given ID is invalid.
- **Code 3:** There was a problem connecting to the resource server.
- **Code 4:** The data could not be transformed from XML to JSON.
- **Code 5:** Unknown error.

## Example Request

http://localhost:8080/my-endpoint/1

## Example Response (Success)

{
"referenceId": "c7d47aac-0978-4c9c-9da1-f5c99191ebac",
"code": "0",
"status": "OK",
"errorMessage": null,
"person": {
"findPersonResult": {
"name": "Newton,Dave R.",
"ssn": "384-10-6538",
"dob": "2000-03-20",
"home": {
"street": "6977 First Street",
"city": "Pueblo",
"state": "AK",
"zip": "63163"
},
"office": {
"street": "9984 Second Blvd",
"city": "Washington",
"state": "MN",
"zip": "42829"
},
"favoriteColors": {
"favoriteColorsItem": "Red"
},
"age": 25
}
}
}