package co.id.theztzt.mysimplecleanarchitecture.data

import co.id.theztzt.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}