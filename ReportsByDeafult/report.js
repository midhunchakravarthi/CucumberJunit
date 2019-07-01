$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sprint1.feature");
formatter.feature({
  "line": 1,
  "name": "Registration Module",
  "description": "In order to Register a new user\r\nI want to naigate to register module",
  "id": "registration-module",
  "keyword": "Feature"
});
formatter.before({
  "duration": 116543,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User Details modification",
  "description": "",
  "id": "registration-module;user-details-modification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@FireFox"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Launch the \"ff\" browser",
  "rows": [
    {
      "cells": [
        "https://demo.nopcommerce.com"
      ],
      "line": 17
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "click on the \"login\" link",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "verify the home is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "modify the details",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Verify that details are updated sucessfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ff",
      "offset": 12
    }
  ],
  "location": "CommonStepDefinitions.launchBrowser(String,DataTable)"
});
formatter.result({
  "duration": 21490491266,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 47408,
  "status": "passed"
});
});