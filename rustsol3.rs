fn merge_sorted_arrays(arr1: &[i32], arr2: &[i32]) -> Vec<i32> {
    let mut merged_array = Vec::new();
    let (mut i, mut j) = (0, 0);

    while i < arr1.len() && j < arr2.len() {
        if arr1[i] <= arr2[j] {
            merged_array.push(arr1[i]);
            i += 1;
        } else {
            merged_array.push(arr2[j]);
            j += 1;
        }
    }

    // Copy remaining elements from arr1, if any
    while i < arr1.len() {
        merged_array.push(arr1[i]);
        i += 1;
    }

    // Copy remaining elements from arr2, if any
    while j < arr2.len() {
        merged_array.push(arr2[j]);
        j += 1;
    }

    merged_array
}

fn main() {
    let arr1 = vec![1, 3, 5, 7, 9];
    let arr2 = vec![2, 4, 6, 8, 10];
    let merged = merge_sorted_arrays(&arr1, &arr2);

    println!("Merged sorted array: {:?}", merged);
}
