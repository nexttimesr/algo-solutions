def flatten_list(arr):
    sum = 0
    def helper(ind):
        if ind == len(arr):
            return 0
        if isinstance(arr[ind], list):
            return flatten_list(arr[ind]) + helper(ind + 1)
        return arr[ind] + helper(ind + 1)

    return helper(0)

def flatten_list_advanced(arr):
    def depth_helper(arr, depth):
        sum = 0
        def helper(ind):
            if ind == len(arr):
                return 0
            if isinstance(arr[ind], list):
                return depth_helper(arr[ind], depth + 1) + helper(ind + 1)
            return arr[ind] + helper(ind + 1)

        return depth * (helper(0))
    return depth_helper(arr, 1)

print(flatten_list([1, 2, 3]))
print(flatten_list([1, [1, 2, 3], 3]))
print(flatten_list([1, [1, [1, [1, [1]]]]]))
print(flatten_list([1,[1,[2],[],[[[[]]]],[],3],3]))
print(flatten_list([[[[]]]]))

print(flatten_list_advanced([1, 2, 3]))
print(flatten_list_advanced([1, [1, 2, 3], 3]))
print(flatten_list_advanced([1, [1, [1, [1, [1]]]]]))
print(flatten_list_advanced([1,[1,[2],[],[[[[]]]],[],3],3]))
print(flatten_list_advanced([[[[]]]]))

