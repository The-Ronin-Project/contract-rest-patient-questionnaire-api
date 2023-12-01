group = "com.projectronin.rest.contract"

plugins {
    alias(roningradle.plugins.openapi.contract)
}

restContractSupport {
    generatorType.set(com.projectronin.rest.contract.GeneratorType.OPENAPI_GENERATOR)
}
