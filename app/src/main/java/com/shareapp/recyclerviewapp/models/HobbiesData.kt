package com.shareapp.recyclerviewapp.models

data class HobbiesData(var title : String){
    object Supplier {
        val hobbies = listOf(
            HobbiesData("Swimming"),
            HobbiesData("Dancing"),
            HobbiesData("Running"),
            HobbiesData("Playing"),
            HobbiesData("Sleeping"),
            HobbiesData("Joking"),
            HobbiesData("Having parties"),
            HobbiesData("Eating"),
            HobbiesData("Fighting"),
            HobbiesData("Drinking"),
            HobbiesData("Chatting"),
            HobbiesData("Dreaming"),
            HobbiesData("Drinking"),
            HobbiesData("Adding new friends"),
            HobbiesData("Cleaning"),
            HobbiesData("Walking")
        )
    }

}