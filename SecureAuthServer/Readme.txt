1) Application accessable with http://localhost:6000/services/oauth/token
2) return will as as below
{
    "access_token": "d1c4bd7a-1835-4985-bb09-219afd610de3",
    "token_type": "bearer",
    "refresh_token": "dbb60384-00e3-4f18-a512-a73dbb431034",
    "expires_in": 43199,
    "scope": "toll_read toll_report"
}

provide the parameters: 
grant_type
claint_id
[{"key":"username","value":"richard","description":""}]
password


--> this is for generating the authentications tokens for access the services.
http://localhost:6000/services/oauth/token

--> Instead of getting the external authorization we are configuring our own server for authorization. we can integrate ldap in this server 
