package com.example.recipe_app_api

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel(){

    init {
        fetchCategories()
    }

    data class RecipeState(
        val loading : Boolean= true,
        val list: List<Catogory> = emptyList(),
        val error: String? = null
    )

    private val _catogorieState = mutableStateOf(RecipeState())
    val catogoriesState : State<RecipeState> = _catogorieState

    private fun fetchCategories(){
        viewModelScope.launch {
            try {
                val response = recipeservice.getCategories()
                _catogorieState.value = _catogorieState.value.copy(
                    list = response.categories,
                    loading = false,
                    error = null
                )
            }catch (e:Exception){
                _catogorieState.value = _catogorieState.value.copy(
                    loading = false,
                    error = "Error found : ${e.message}"
                )
            }
        }
    }

}
