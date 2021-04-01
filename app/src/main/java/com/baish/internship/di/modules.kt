package com.baish.internship.di

import com.baish.internship.ui.bottomnavigation.home.agro.AgroMarkViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module


val viewModelModule: Module = module{
    viewModel { AgroMarkViewModel() }

}

val repositoryModule: Module = module {

}

val apiModule: Module = module {

}

val appModules =
    listOf(viewModelModule, apiModule, repositoryModule)