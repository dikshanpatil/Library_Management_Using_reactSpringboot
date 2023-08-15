export const oktaConfig = {
    clientId : '0oaagjfy9a1Gnjrla5d7',
    issuer : 'https://dev-73004132.okta.com/oauth2/default',
    redirectUri: 'https://localhost:3000/login/callback',
    scopes:['openid', 'profile', 'email'],
    pkce : true,
    disableHttpsCheck : true, 
}