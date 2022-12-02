package com.wahyurhy.jetheroes.data

import com.wahyurhy.jetheroes.model.Hero
import com.wahyurhy.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}