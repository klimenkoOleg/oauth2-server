insert ignore into `oauth_client_details`(`client_id`,`resource_ids`,`client_secret`,`scope`,`authorized_grant_types`,`web_server_redirect_uri`,`authorities`,`access_token_validity`,`refresh_token_validity`,`additional_information`,`autoapprove`) values ('oauth2-jwt-client','resource-server-rest-api','$2a$08$qvrzQZ7jJ7oy2p/msL4M0.l83Cd0jNsX6AJUitbgRXGzge4j035ha','read','password,authorization_code,refresh_token,client_credentials,implicit','https://www.getpostman.com/oauth2/callback','USER',10800,2592000,null,null);
insert ignore into `authority`(`name`) values ('ADMIN');
insert ignore into `user`(`account_expired`,`account_locked`,`credentials_expired`,`enabled`,`password`,`user_name`) values (0,0,0,1,'$2a$08$qvrzQZ7jJ7oy2p/msL4M0.l83Cd0jNsX6AJUitbgRXGzge4j035ha','admin');
insert ignore into `user_authority`(`authority_id`,`user_id`) values (1,1);


curl -X POST \
  http://localhost:8080/oauth/token \
  -H 'authorization: Basic b2F1dGgyLWp3dC1jbGllbnQ6YWRtaW4xMjM0' \
  -H 'cache-control: no-cache' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -H 'postman-token: 7264a216-8567-8fbd-1e9e-4733d07d205b' \
  -F grant_type=client_credentials