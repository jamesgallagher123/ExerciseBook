def lcs[T]: (List[T], List[T]) => List[T] = {
    case (_, Nil) => Nil
    case (Nil, _) => Nil
    case (x :: xs, y :: ys) if x == y => x :: lcs(xs, ys)
    case (x :: xs, y :: ys)           => {
        (lcs(x :: xs, ys), lcs(xs, y :: ys)) match {
            case (xs, ys) if xs.length > ys.length => xs
            case (xs, ys)                          => ys
        }
    }
}

val list1: List[Char] = List('A','B','C')
val list2: List[Char] = List('A','B')

lcs(list1, list2)