package com.sagar.testing.model

data class UsersResponse(
    var page: String,
    var per_page: String,
    var total: String,
    var total_pages: String,
    var data: ArrayList<User>
)