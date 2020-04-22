package ru.skillbranch.devintensive.extensions

import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UserView
import java.util.*

fun User.toUserView(): UserView{

    val nickName = ""
    val initials = ""
    val status = if(lastVisit == null) "Еще ни разу не бил" else if (isOnline) "onLine" else "Последний раз бил ${lastVisit.humanizeDiff()}"

    return UserView(id,
        fullName = "$firstName $lastName"  ,
        nickName = nickName,
        initials = initials,
        avatar = avatar,
        status = status
     )
}

private fun Date.humanizeDiff(date: Date = Date()): String {
    //TODO  not implimented - To change body of created fun use file/settings/file template
    return ""

}
