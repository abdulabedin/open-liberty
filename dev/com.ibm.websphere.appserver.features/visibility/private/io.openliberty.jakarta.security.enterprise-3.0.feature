-include= ~${workspace}/cnf/resources/bnd/feature.props
symbolicName=io.openliberty.jakarta.security.enterprise-3.0
singleton=true
-features=\
  com.ibm.websphere.appserver.eeCompatible-10.0
-bundles=\
  io.openliberty.jakarta.security.2.0; location:=dev/api/spec/; mavenCoordinates="jakarta.security.enterprise:jakarta.security.enterprise-api:2.0.0"
kind=noship
edition=full

