package mx.finerio.pfm.api.services.gorm

import grails.gorm.services.Query
import grails.gorm.services.Service
import mx.finerio.pfm.api.domain.Account
import mx.finerio.pfm.api.domain.Transaction

@Service(Transaction)
interface TransactionGormService {
    Transaction save(Transaction transaction)
    Transaction getById(Long id)
    List<Transaction> findAll()
    List<Transaction> findAllByDateDeletedIsNull(Map args)
    List<Transaction> findAllByDateDeletedIsNullAndIdLessThanEquals(Long id, Map args)
    List<Transaction> findAllByAccountAndIdLessThanEqualsAndDateDeletedIsNull(Account account, Long id, Map args)
    List<Transaction> findAllByAccountAndDateGreaterThanAndChargeAndDateDeletedIsNull(Account account, Date date, Boolean charge, Map args)
    List<Transaction> findAllByAccountAndDateDeletedIsNull(Account account, Map args)
    void delete(Serializable id)
    @Query("from ${Transaction a} where $a.id = $id and a.dateDeleted is Null")
    Transaction findByIdAndDateDeletedIsNull(Long id)
}