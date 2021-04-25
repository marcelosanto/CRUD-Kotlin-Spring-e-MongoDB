package xyz.marcelosantos.bankaccount

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("accounts")
class AccountController(val repository: AccountRepository) {

    @PostMapping
    fun create(@RequestBody account: Account) = ResponseEntity.ok(repository.save(account))

}