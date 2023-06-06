package com.github.migellal.coimpl.listeners

import com.intellij.openapi.editor.event.DocumentEvent
import com.intellij.openapi.editor.event.DocumentListener

class EditorListener : DocumentListener {
    override fun documentChanged(event: DocumentEvent) {
        super.documentChanged(event)
        println(event.source)
        println(event.document.text)
        println(event.newFragment)
        println(event.oldFragment)
        println(event.document)
    }
}
