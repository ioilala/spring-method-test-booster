package com.github.ioilala.springmethodtestbooster.services

import com.github.ioilala.springmethodtestbooster.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
