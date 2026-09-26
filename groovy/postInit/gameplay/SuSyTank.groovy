import static prePostInit.Recipemaps.*
import static gregtech.api.GTValues.*
import postInit.utils.RecyclingHelper

// monel400 recipe

INDUCTION_FURNACE.recipeBuilder()
    .fluidInputs(fluid('nickel') * 2268)  //are 15,75 ingot or is 63/4
    .inputs(ore('dustCopper') * 8)
    .inputs(ore('dustTinyIron') * 3)
    .inputs(ore('dustTinyManganese') * 2)
    .inputs(ore('dustSmallSilicon') * 2)
    .fluidOutputs(fluid('Monel_400') * 3600)
    .EUt(VA[MV])
    .duration(960)
    .buildAndRegister()

SOLIDIFIER.recipeBuilder()
    .fluidInputs(fluid('Monel_400') * 144)
    .outputs(metaitem('ingotMonel_400'))
    .duration(20)
    .EUt(2)
    .buildAndRegister()

// controller recipe

crafting.addShaped("susy:wood_tank_controller", metaitem('susy:wood_tank_controller'), [
    [null, null, null],
    [null, null, null],
    [null, null, null]
])

crafting.addShaped("susy:steel_tank_controller", metaitem('susy:steel_tank_controller'), [
    [null, null, null],
    [null, null, null],
    [null, null, null]
])

crafting.addShaped("susy:monel_tank_controller", metaitem('susy:monel_tank_controller'), [
    [null, null, null],
    [null, null, null],
    [null, null, null]
])

crafting.addShaped("susy:stainless_steel_tank_controller", metaitem('susy:stainless_steel_tank_controller'), [
    [null, null, null],
    [null, null, null],
    [null, null, null]
])

crafting.addShaped("susy:titanium_tank_controller", metaitem('susy:titanium_tank_controller'), [
    [null, null, null],
    [null, null, null],
    [null, null, null]
])

crafting.addShaped("susy:tungsten_steel_tank_controller", metaitem('susy:tungsten_steel_tank_controller'), [
    [null, null, null],
    [null, null, null],
    [null, null, null]
])

// valve recipe

crafting.addShaped("susy:wood_tank_valve", metaitem('susy:wood_tank_valve'), [
    [null, null, null],
    [null, null, null],
    [null, null, null]
])

crafting.addShaped("susy:steel_tank_valve", metaitem('susy:steel_tank_valve'), [
    [null, null, null],
    [null, null, null],
    [null, null, null]
])

crafting.addShaped("susy:monel_tank_valve", metaitem('susy:monel_tank_valve'), [
    [null, null, null],
    [null, null, null],
    [null, null, null]
])

crafting.addShaped("susy:stainless_steel_tank_valve", metaitem('susy:stainless_steel_tank_valve'), [
    [null, null, null],
    [null, null, null],
    [null, null, null]
])

crafting.addShaped("susy:titanium_tank_valve", metaitem('susy:titanium_tank_valve'), [
    [null, null, null],
    [null, null, null],
    [null, null, null]
])

crafting.addShaped("susy:tungsten_steel_tank_valve", metaitem('susy:tungsten_steel_tank_valve'), [
    [null, null, null],
    [null, null, null],
    [null, null, null]
])