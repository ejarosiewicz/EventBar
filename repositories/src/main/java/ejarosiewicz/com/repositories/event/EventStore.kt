package ejarosiewicz.com.repositories.event

import ejarosiewicz.com.repositories.event.model.Event

interface EventStore {
    fun put(event: Event)
    fun remove(event: Event)
    fun update(event: Event)
    fun read(): Event
}
