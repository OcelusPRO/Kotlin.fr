
data class IfType<T>(
    val ifValue: Boolean,
    val ifResult: T?
) {
    override fun toString(): String {
        return ifResult.toString()
    }
}
fun<T> si(boolean: Boolean, action: () -> T?): IfType<T> {
    if (boolean) return IfType(true, action())
    return IfType(false, null)
}

infix fun<T> IfType<T>.sinon(action: () -> T?): T? {
    if (ifValue) return ifResult
    return action()
}


