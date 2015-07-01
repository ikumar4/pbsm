$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login1.feature");
formatter.feature({
  "line": 1,
  "name": "Login1 checkout",
  "description": "",
  "id": "login1-checkout",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to log-in",
  "description": "",
  "id": "login1-checkout;user-should-be-able-to-log-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@PBSLogin"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on Product builder log-in screen",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter valid credential",
  "rows": [
    {
      "cells": [
        "Fields",
        "value"
      ],
      "line": 7
    },
    {
      "cells": [
        "username",
        "ikumar"
      ],
      "line": 8
    },
    {
      "cells": [
        "password",
        "V2VzdGVybkAwMDg\u003d"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User is logged in successfully \"Cengage Tools\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination1.loginscreen()"
});
formatter.result({
  "duration": 5286563353,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination1.Enter(DataTable)"
});
formatter.result({
  "duration": 1945064171,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination1.loginbutton()"
});
formatter.result({
  "duration": 1121229254,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cengage Tools",
      "offset": 32
    }
  ],
  "location": "StepDefination1.loggedin(String)"
});
formatter.result({
  "duration": 1630092288,
  "status": "passed"
});
formatter.uri("Productbuilder.feature");
formatter.feature({
  "line": 1,
  "name": "Product builder page",
  "description": "",
  "id": "product-builder-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Navigate to Product builder applicaiton",
  "description": "",
  "id": "product-builder-page;navigate-to-product-builder-applicaiton",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@PBSLanding"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "# Given User is logged in successfully \"Cengage Tools\""
    }
  ],
  "line": 6,
  "name": "Click on Product Builder link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be navigated to \"Welcome to Product Builder\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination1.Pblink()"
});
formatter.result({
  "duration": 2838881090,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to Product Builder",
      "offset": 29
    }
  ],
  "location": "StepDefination1.Welpbs(String)"
});
formatter.result({
  "duration": 1341247812,
  "status": "passed"
});
});