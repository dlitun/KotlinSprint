package lesson22_task4

data class MainScreenState(
    val data: String,
    val isLoading: Boolean = false
)

class MainScreenViewModel {

    var mainScreenState = MainScreenState(data = "No data", isLoading = false)

    fun loadData() {
        println("State: $mainScreenState")

        mainScreenState = mainScreenState.copy(isLoading = true)
        println("State: $mainScreenState")

        mainScreenState = mainScreenState.copy(data = "Server data loaded", isLoading = false)
        println("State: $mainScreenState")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}