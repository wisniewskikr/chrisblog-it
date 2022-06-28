Console:
- http://localhost:8083/auth
- bael-admin
- pass

Client:
john@test.com / 123
mike@other.com / pass

Keycloack changes:
- KeycloackServerProperties.java
- application.yml
- helloworld-realm.json
- METE-INF/services/org.keycloak.common.util.ResteasyProvider
- METE-INF/services/org.keycloak.platform.PlatformProvider

Client changes:
- pom.xml
- application.yml
- UiSecurityConfig.java