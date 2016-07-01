fn main() {
    for i in 1..101 {
        if i % 15 == 0 {
            print!("FIZZBUZZ ");
        } else if i % 3 == 0 {
            print!("FIZZ ");
        } else if i % 5 == 0 { 
            print!("BUZZ ");
        } else { 
            print!("{} ", i);
        }
    }
    println!("");
}
