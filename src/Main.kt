private class Main:Buku {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bBagus = BukuBagus().also({
                it.cover()
                it.judul()
                it.Bab()
            })
        }
    }

    override fun cover() {
        TODO("Not yet implemented")
    }

    override fun judul() {
        TODO("Not yet implemented")
    }

    override fun Bab() {
        TODO("Not yet implemented")
    }
}