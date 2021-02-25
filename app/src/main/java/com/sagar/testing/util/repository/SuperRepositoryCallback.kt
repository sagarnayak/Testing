package com.sagar.testing.util.repository

interface SuperRepositoryCallback<in T> {
    fun success(result: T) {}
    fun successWithDynamicValues(result: T, dynamicFields: ArrayList<DynamicField>) {}
    fun notAuthorised() {}
    fun twoFactorNotDone() {}
    fun noContent() {}
    fun error(result: Result) {}
}