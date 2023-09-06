# GitApiConsume-REST

REST version of application, that consumes Github Api. The application was made with Java and SpringBoot.   
In return of Get request with header with parameter „Accept: application/xml” application returns 404 error with message: "XML is not acceptable". 
Parameter „Accept: application/json” grants access to api. 
When user in request parameter pass username, that does not exist in GitHub or will send empty value, api will return 406 error.
When header and username will be correct, user will recive list of all his github repositories, which are not forks. Additionally for each repository will get list of its branches with names and the last commit sha.
