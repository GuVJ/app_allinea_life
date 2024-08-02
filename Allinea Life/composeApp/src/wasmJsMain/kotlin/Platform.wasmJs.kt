class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm - Teste"
}

actual fun getPlatform(): Platform = WasmPlatform()