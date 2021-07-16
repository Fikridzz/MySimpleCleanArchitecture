package co.id.theztzt.mysimplecleanarchitecture.di

import co.id.theztzt.mysimplecleanarchitecture.data.IMessageDataSource
import co.id.theztzt.mysimplecleanarchitecture.data.MessageDataSource
import co.id.theztzt.mysimplecleanarchitecture.data.MessageRepository
import co.id.theztzt.mysimplecleanarchitecture.domain.IMessageRepository
import co.id.theztzt.mysimplecleanarchitecture.domain.MessageInteractor
import co.id.theztzt.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}