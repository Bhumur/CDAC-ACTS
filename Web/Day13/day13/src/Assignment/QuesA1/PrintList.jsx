import FruitContext from "./FruitContext"

const PrintList = () => {
    return (
            <ol>
                <FruitContext.Consumer>
                    {
                        (value) => {
                            return (
                                value.fruit.map((item)=>{return (<li>{item}</li>);})
                            )
                        }
                    }
                </FruitContext.Consumer>
            </ol>
    )
}
export default PrintList