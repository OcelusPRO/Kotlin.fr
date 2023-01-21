
data class IfType(
    val ifValue: Boolean,
    val ifResult: Any?
) {
    override fun toString(): String {
        return ifResult.toString()
    }
}
fun si(boolean: Boolean, action: () -> Any?): IfType {
    if (boolean) return IfType(true, action())
    return IfType(false, null)
}

infix fun IfType.sinon(action: () -> Any?): Any? {
    if (ifValue) return ifResult
    return action()
}


