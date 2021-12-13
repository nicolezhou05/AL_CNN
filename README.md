# Lab02: Well Al B. Sorted

## TNPG: CNN (Nada Hameed + Ray, Nicole Zhou + Duck, Corina Chen + Binktop)

### AlTester
It contains the methods `isSorted` that check if an array is sorted or not (returns true if the array is sorted, false otherwise).

### OrderedArrayList
- `toString` : displays information in a specific way
- `remove` : using the given index, it removes the element of that index in the array
- `size` : returns the length of the array that displays the meaningful data
- `get` : returns the value of the element at the given index in the array
- `add` : takes in a value as a parameter and adds it to the end of the array
- `addLinear` : Takes newVal as the parameter. It uses a for loop that goes through each element of the array one by one to add newVal that will continue to maintain the invariant that its elements are sorted. However, if the array is empty or that newVal is greater than all the elements in the array, newVal is added to the end of the array.
- `addBinary` : Takes newVal as the parameter. It checks the value of the element that is in the middle of the array and compares it with newVal. If newVal is less than the middle value, it checks the middle value again for the first half of the array. If newVal is greater than the middle value, it checks the middle value for the second half of the array. This process is repeated until we can add newVal into the array that will continue to maintain the invariant that its elements are sorted.
