# Service

Get started with the insta-toggles **Service** container.

## Before you start

Make sure you have a running:
- [Docker](https://www.docker.com/) environment.
- [PostgreSQL](https://www.postgresql.org/) instance version 16 or higher.
- Authentication provider, like [Keycloak](https://www.keycloak.org/).

## Start the service

::: code-group

```sh [docker]
docker run -p 8080:8080 \
-e DATASOURCE_USERNAME=${DATASOURCE_USERNAME}  \
-e DATASOURCE_PASSWORD=${DATASOURCE_PASSWORD}  \
-e DATASOURCE_HOST=${DATASOURCE_HOST}  \
-e DATASOURCE_PORT=5432  \
-e DATASOURCE_DATABASE=${DATASOURCE_DATABASE}  \
-e OIDC_AUTH_SERVER_URL=${OIDC_AUTH_SERVER_URL}  \
-e OIDC_CLIENT_ID=${OIDC_CLIENT_ID}  \
-e OIDC_TOKEN_JWT_ISSUER=${OIDC_TOKEN_JWT_ISSUER}  \
-e OIDC_TOKEN_JWT_AUDIENCE=${OIDC_TOKEN_JWT_AUDIENCE}  \
ghcr.io/sebastian-struecker/insta-toggles/service:1.0.0-snapshot
```