package org.example.lesson2

fun main() {
    val permanentEmployees = 50
    val permanentSalary = 30000
    val interns = 30
    val internSalary = 20000

    val permanentPayroll = permanentEmployees * permanentSalary
    val totalPayroll = permanentPayroll + (interns * internSalary)
    val averageSalary = totalPayroll / (permanentEmployees + interns)

    println("Расходы на постоянных сотрудников: $permanentPayroll")
    println("Общие расходы по зарплате: $totalPayroll")
    println("Средняя зарплата: $averageSalary")
}