package com.example.cube

import javafx.scene.Group
import javafx.scene.PerspectiveCamera
import javafx.scene.PointLight
import javafx.scene.Scene
import javafx.scene.paint.Color
import javafx.scene.shape.Box
import javafx.stage.Stage
import javafx.scene.control.Slider


class CubeController {
    lateinit var sldZ2: Slider
    lateinit var sldY2: Slider
    lateinit var sldX2: Slider
    lateinit var sldZ1: Slider
    lateinit var sldY1: Slider
    lateinit var sldX1: Slider

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

        // create a scene
        val scene = Scene(group, 800.0, 800.0)
        scene.camera = camera

        // create a stage
        val stage = Stage()
        stage.title = "3D Box"
        stage.scene = scene
        stage.show()

        // bind the first set of sliders to the size of the box
        box.scaleXProperty().bind(sldX1.valueProperty())
        box.scaleYProperty().bind(sldY1.valueProperty())
        box.scaleZProperty().bind(sldZ1.valueProperty())

        // bind the second set of sliders to the location of the box
        box.translateXProperty().bind(sldX2.valueProperty())
        box.translateYProperty().bind(sldY2.valueProperty())
        box.translateZProperty().bind(sldZ2.valueProperty())
    }
}