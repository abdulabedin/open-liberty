-include= ~${workspace}/cnf/resources/bnd/feature.props
symbolicName=com.ibm.websphere.appserver.org.eclipse.microprofile.faulttolerance-3.0
singleton=true
-features=io.openliberty.mpCompatible-4.0, \
  com.ibm.websphere.appserver.javax.cdi-2.0
-bundles=io.openliberty.org.eclipse.microprofile.faulttolerance.3.0; location:="dev/api/stable/,lib/"; mavenCoordinates="org.eclipse.microprofile.fault-tolerance:microprofile-fault-tolerance-api:3.0"
kind=ga
edition=core
WLP-Activation-Type: parallel
