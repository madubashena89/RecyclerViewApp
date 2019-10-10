package com.example.recyclerviewapp

data class HobbiesData(var title : String){
    object Supplier {
        val hobbies = listOf<HobbiesData>(
            HobbiesData("Swim"),
            HobbiesData("Dance"),
            HobbiesData("Run"),
            HobbiesData("Play"),
            HobbiesData("Sleep"),
            HobbiesData("Joke"),
            HobbiesData("Sex"),
            HobbiesData("Eat"),
            HobbiesData("Fight"),
            HobbiesData("Hookup"),
            HobbiesData("Chat"),
            HobbiesData("Dream"),
            HobbiesData("Drink"),
            HobbiesData("Add"),
            HobbiesData("Clean"),
            HobbiesData("Move")
        )
    }

}