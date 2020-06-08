create table oauth_client_details
(
    client_id               VARCHAR(256) PRIMARY KEY,
    resource_ids            VARCHAR(256),
    client_secret           VARCHAR(256),
    scope                   VARCHAR(256),
    authorized_grant_types  VARCHAR(256),
    web_server_redirect_uri VARCHAR(256),
    authorities             VARCHAR(256),
    access_token_validity   INTEGER,
    refresh_token_validity  INTEGER,
    additional_information  VARCHAR(4096),
    autoapprove             VARCHAR(256)
);

curl -X POST   http://localhost:8081/oauth/token   -H 'authorization: Basic b2F1dGgyLWp3dC1jbGllbnQ6YWRtaW4xMjM0'   -H 'cache-control: no-cache'   -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW'   -H 'postman-token: 7264a216-8567-8fbd-1e9e-4733d07d205b'   -F grant_type=client_credentials
curl -X POST   http://localhost:8081/v1/oauth2/token   -H 'authorization: Basic b2F1dGgyLWp3dC1jbGllbnQ6YWRtaW4xMjM0'   -H 'cache-control: no-cache'   -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW'   -H 'postman-token: 7264a216-8567-8fbd-1e9e-4733d07d205b'   -F grant_type=client_credentials


curl -X POST   http://localhost:8080   -H 'authorization: Basic b2F1dGgyLWp3dC1jbGllbnQ6YWRtaW4xMjM0'   -H 'cache-control: no-cache'   -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW'   -H 'postman-token: 7264a216-8567-8fbd-1e9e-4733d07d205b'   -F grant_type=client_credentials

