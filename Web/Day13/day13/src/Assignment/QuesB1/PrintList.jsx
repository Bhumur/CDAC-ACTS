import FruitContext from "./FruitContext"

const PrintList = () => {
    return (
            <ol>
                <FruitContext.Consumer>
                    {
                        (value) => {
                            return (
                                value.fruit.map((item)=>{return (
                                <>
                                    <li key={item}>{item}</li>
                                    <button id={item} onClick={(item)=>{value.deleteFruit(item.target.id)}}>Delete</button>
                                </>
                                );})
                            )
                        }   
                    }
                </FruitContext.Consumer>
            </ol>
    )
}
export default PrintList