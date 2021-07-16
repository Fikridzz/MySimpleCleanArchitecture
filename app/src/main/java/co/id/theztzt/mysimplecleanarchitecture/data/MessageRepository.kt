package co.id.theztzt.mysimplecleanarchitecture.data

import co.id.theztzt.mysimplecleanarchitecture.domain.IMessageRepository
import co.id.theztzt.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}