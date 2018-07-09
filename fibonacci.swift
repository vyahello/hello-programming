#!/usr/bin/swift

func fibonacci(_ n: Int) -> Int {
    if n <= 2 {
        return 1
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}

let arg = CommandLine.arguments[1]
if let n = Int(arg) {
    print(fibonacci(n))
} else {
    print("Usage: fibonacci <n>")
}
