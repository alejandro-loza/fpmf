package mx.finerio.pfm.api.dtos

import groovy.transform.ToString

import mx.finerio.pfm.api.domain.Budget
import mx.finerio.pfm.api.domain.Category
import mx.finerio.pfm.api.domain.User

@ToString(includeNames = true, includePackage = false)
class BudgetDto {
    Long id
    Long categoryId
    String name
    BigDecimal amount
    Date dateCreated
    Date lastUpdated

    BudgetDto(){}

    BudgetDto(Budget budget) {
        this.id = budget.id
        this.categoryId = budget.category.id
        this.name = budget.name
        this.amount = budget.amount
        this.dateCreated = budget.dateCreated
        this.lastUpdated = budget.lastUpdated
    }

}
