package com.mycompany.mvvmletsgo.data

class Comment (val commentText:String ,
               val author:String) {

    override fun toString(): String {
        return "author is : $author *** --- $commentText "
    }
}