package com.company.footballinfo

class mUser(val name:String?="",val phone:String?="",val pass:String?="") {
    companion object{
        var currentUser:mUser?=null
    }
}