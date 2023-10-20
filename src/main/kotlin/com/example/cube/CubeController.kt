package com.example.cube

import javafx.scene.Group
import javafx.scene.PerspectiveCamera
import javafx.scene.PointLight
import javafx.scene.Scene
import javafx.scene.paint.Color
import javafx.scene.shape.Box
import javafx.stage.Stage


class CubeController {
    fun initialize(){
        // create a 3D box
        val box = Box(200.0, 200.0, 200.0)

        // create a point light
        val light = PointLight(Color.CYAN)

        // create a group
        val group = Group()
        group.children.addAll(box, light)

        // create a camera
        val fixedEyeAtCameraZero = false
        val camera = PerspectiveCamera(fixedEyeAtCameraZero)
        camera.translateX = 150.0
        camera.translateY = -100.0
        camera.translateZ = 250.0

        // create a scene
        val scene = Scene(group, 800.0, 800.0)
        scene.camera = camera

        // create a stage
        val stage = Stage()
        stage.title = "3D Box"
        stage.scene = scene
        stage.show()
    }
}