package mx.finerio.pfm.api.domain

import grails.gorm.annotation.Entity
import io.micronaut.security.authentication.providers.UserState
import org.grails.datastore.gorm.GormEntity

@Entity
class Client implements GormEntity<Client>, UserState {

    String username
    String password
    boolean enabled = true
    boolean accountExpired = false
    boolean accountLocked = false
    boolean passwordExpired = false
    Date dateCreated
    Date lastUpdated
    Date dateDeleted

    static constraints = {
        username nullable: false, blank: false, unique: true
        password nullable: false, blank: false, password: true
        dateDeleted nullable:true
    }

    static mapping = {
        table 'client'
    }

}
