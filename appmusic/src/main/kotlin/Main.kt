fun main(){
    val composer = Composer()
    composer.name = "Banda Dejavu"
    composer.biogrady = "Uma banda muito doida!!!"

    val music = Music()
    music.title = "me libera"
    music.duration = 120
    music.musicGender = MusicGender.POP
    music.composer = composer

    println("A música ${music.title} foi composta pela ${music.composer.name} com o ")
}