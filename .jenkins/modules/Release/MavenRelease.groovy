withMaven(jdk: CFG.jdk) {
    sh """
        mvn clean deploy -DaltDeploymentRepository=payara-artifacts::https://nexus.payara.fish/repository/payara-artifacts/
        -DskipTests -Dmaven.test.skip=true
        -Dtests.excluded=true"""
}