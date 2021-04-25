package xyz.marcelosantos.bankaccount


import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*


interface AccountRepository: MongoRepository<Account, String> {
    fun findByDocument(document: String): Optional<Account>
}